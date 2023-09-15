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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Bucket JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketJsonUnmarshaller implements Unmarshaller<Bucket, JsonUnmarshallerContext> {

    public Bucket unmarshall(JsonUnmarshallerContext context) throws Exception {
        Bucket bucket = new Bucket();

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
                if (context.testExpression("resourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("accessRules", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setAccessRules(AccessRulesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bundleId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setBundleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("url", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setLocation(ResourceLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("supportCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setSupportCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("objectVersioning", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setObjectVersioning(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ableToUpdateBundle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setAbleToUpdateBundle(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("readonlyAccessAccounts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setReadonlyAccessAccounts(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("resourcesReceivingAccess", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setResourcesReceivingAccess(new ListUnmarshaller<ResourceReceivingAccess>(ResourceReceivingAccessJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setState(BucketStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("accessLogConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucket.setAccessLogConfig(BucketAccessLogConfigJsonUnmarshaller.getInstance().unmarshall(context));
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

        return bucket;
    }

    private static BucketJsonUnmarshaller instance;

    public static BucketJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BucketJsonUnmarshaller();
        return instance;
    }
}
