package org.example.myapi;

import org.example.myapi.api.MyApiController;
import org.example.myapi.models.MyFifthEntity;
import org.example.myapi.models.MySecondEntity;
import org.junit.Before;
import org.junit.Test;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by nwoolls on 11/20/16.
 */
public class HypertextLinksTest {

    private static final String REL_FIRST = "first";
    private static final String REL_SECOND = "second";
    private static final String REL_SELF = "self";

    @Before
    public void beforeEachTest() {
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
    }

    @Test
    public void addResourceLinks() throws Exception {

        final int listSize = 200;

        addResourceLinks(listSize, true);
        addResourceLinks(listSize, true);
        addResourceLinks(listSize, true);

        addResourceLinks(listSize, false);
        addResourceLinks(listSize, false);
        addResourceLinks(listSize, false);
    }

    private List<MyFifthEntity> addResourceLinks(final int listSize, final boolean useBuilder) {
        final List<MyFifthEntity> results = createMockEntities(listSize);
        addResourceLinks(results, useBuilder);
        return results;
    }

    private void addResourceLinks(final List<MyFifthEntity> entities, final boolean useBuilder) {
        long startTime = System.currentTimeMillis();
        for (final MyFifthEntity entity : entities) {
            addResourceLinks(entity, useBuilder);
        }
        long duration = (System.currentTimeMillis() - startTime);

        System.err.println(String.format("%d milliseconds to add 3 Spring HATEOAS links to %d items %s ControllerLinkBuilder",
                duration, entities.size(), useBuilder ? "USING" : "NOT USING"));
    }

    private MyFifthEntity addResourceLinks(final MyFifthEntity myFifthEntity, final boolean useBuilder) {
        final MySecondEntity location = myFifthEntity.getLocation();
        final String primaryId = location.getPrimaryId();
        final String secondaryId = location.getSecondaryId();

        if (useBuilder) {
            myFifthEntity.add(ControllerLinkBuilder.linkTo(
                    methodOn(MyApiController.class)
                            .apiV1MyApiApplesPrimaryIdBananasSecondaryIdGet(primaryId, secondaryId))
                    .withSelfRel());

            myFifthEntity.add(linkTo(
                    methodOn(MyApiController.class)
                            .apiV1MyApiApplesPrimaryIdGet(primaryId))
                    .withRel(REL_FIRST));

            myFifthEntity.add(linkTo(
                    methodOn(MyApiController.class)
                            .apiV1MyApiApplesPrimaryIdOrangesSecondaryIdGet(primaryId, secondaryId))
                    .withRel(REL_SECOND));
        } else {

            myFifthEntity.add(
                    new Link("http://example.com", REL_SELF),
                    new Link("http://example.com", REL_FIRST),
                    new Link("http://example.com", REL_SECOND)
            );
        }

        return myFifthEntity;
    }

    private List<MyFifthEntity> createMockEntities(final int listSize) {
        final List<MyFifthEntity> entities = new ArrayList<>(listSize);

        for (int i = 0; i < listSize; i++) {
            final MySecondEntity location = new MySecondEntity()
                    .secondaryId("doesnt")
                    .primaryId("matter");
            final MyFifthEntity entity = new MyFifthEntity()
                    .location(location);
            entities.add(entity);
        }
        return entities;
    }

}