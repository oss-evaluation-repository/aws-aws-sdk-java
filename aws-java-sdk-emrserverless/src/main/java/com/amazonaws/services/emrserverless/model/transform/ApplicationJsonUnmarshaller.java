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
package com.amazonaws.services.emrserverless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.emrserverless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Application JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationJsonUnmarshaller implements Unmarshaller<Application, JsonUnmarshallerContext> {

    public Application unmarshall(JsonUnmarshallerContext context) throws Exception {
        Application application = new Application();

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
                if (context.testExpression("applicationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("releaseLabel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setReleaseLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stateDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setStateDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("initialCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setInitialCapacity(new MapUnmarshaller<String, InitialCapacityConfig>(context.getUnmarshaller(String.class),
                            InitialCapacityConfigJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("maximumCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setMaximumCapacity(MaximumAllowedResourcesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("autoStartConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setAutoStartConfiguration(AutoStartConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("autoStopConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setAutoStopConfiguration(AutoStopConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("networkConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setNetworkConfiguration(NetworkConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("architecture", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setArchitecture(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setImageConfiguration(ImageConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("workerTypeSpecifications", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    application.setWorkerTypeSpecifications(new MapUnmarshaller<String, WorkerTypeSpecification>(context.getUnmarshaller(String.class),
                            WorkerTypeSpecificationJsonUnmarshaller.getInstance()).unmarshall(context));
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

        return application;
    }

    private static ApplicationJsonUnmarshaller instance;

    public static ApplicationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationJsonUnmarshaller();
        return instance;
    }
}
