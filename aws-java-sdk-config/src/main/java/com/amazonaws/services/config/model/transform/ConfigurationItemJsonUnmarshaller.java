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
package com.amazonaws.services.config.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConfigurationItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationItemJsonUnmarshaller implements Unmarshaller<ConfigurationItem, JsonUnmarshallerContext> {

    public ConfigurationItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConfigurationItem configurationItem = new ConfigurationItem();

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
                if (context.testExpression("version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("accountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configurationItemCaptureTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setConfigurationItemCaptureTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("configurationItemStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setConfigurationItemStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configurationStateId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setConfigurationStateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configurationItemMD5Hash", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setConfigurationItemMD5Hash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setResourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsRegion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setAwsRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("availabilityZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceCreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setResourceCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("relatedEvents", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setRelatedEvents(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("relationships", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setRelationships(new ListUnmarshaller<Relationship>(RelationshipJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("configuration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("supplementaryConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    configurationItem.setSupplementaryConfiguration(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
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

        return configurationItem;
    }

    private static ConfigurationItemJsonUnmarshaller instance;

    public static ConfigurationItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationItemJsonUnmarshaller();
        return instance;
    }
}
