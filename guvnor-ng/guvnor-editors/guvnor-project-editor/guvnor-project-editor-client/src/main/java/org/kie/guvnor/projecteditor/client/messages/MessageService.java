/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.guvnor.projecteditor.client.messages;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.ListDataProvider;
import org.kie.guvnor.commons.service.builder.model.Message;
import org.kie.guvnor.commons.service.builder.model.Messages;
import org.uberfire.client.mvp.PlaceManager;

/**
 * Service for Message Console, the Console is a screen that shows compile time errors.
 * This listens to Messages and if the Console is not open it opens it.
 */
@ApplicationScoped
public class MessageService {

    private final PlaceManager placeManager;

    private ListDataProvider<Message> dataProvider = new ListDataProvider<Message>();

    @Inject
    public MessageService( PlaceManager placeManager ) {
        this.placeManager = placeManager;
    }

    public void addMessages( @Observes Messages messages ) {
        List<Message> list = dataProvider.getList();
        list.clear();
        for ( Message message : messages ) {
            list.add( message );
        }

        placeManager.goTo( "org.kie.guvnor.Messages" );
    }

    public void addDataDisplay( HasData<Message> display ) {
        dataProvider.addDataDisplay( display );
    }
}
