/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.outposts.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.outposts.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Site JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SiteJsonUnmarshaller implements Unmarshaller<Site, JsonUnmarshallerContext> {

    public Site unmarshall(JsonUnmarshallerContext context) throws Exception {
        Site site = new Site();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("SiteId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    site.setSiteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    site.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    site.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    site.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    site.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("SiteArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    site.setSiteArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Notes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    site.setNotes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OperatingAddressCountryCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    site.setOperatingAddressCountryCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OperatingAddressStateOrRegion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    site.setOperatingAddressStateOrRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OperatingAddressCity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    site.setOperatingAddressCity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RackPhysicalProperties", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    site.setRackPhysicalProperties(RackPhysicalPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (token == FIELD_NAME && !knownMember) {
                    context.nextToken();
                    com.amazonaws.transform.UnknownMemberJsonUnmarshaller.getInstance().unmarshall(context);
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return site;
    }

    private static SiteJsonUnmarshaller instance;

    public static SiteJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SiteJsonUnmarshaller();
        return instance;
    }
}
