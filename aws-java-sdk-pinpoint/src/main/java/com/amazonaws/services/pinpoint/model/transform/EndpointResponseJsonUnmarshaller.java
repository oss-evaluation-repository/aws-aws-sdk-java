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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EndpointResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointResponseJsonUnmarshaller implements Unmarshaller<EndpointResponse, JsonUnmarshallerContext> {

    public EndpointResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        EndpointResponse endpointResponse = new EndpointResponse();

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
                if (context.testExpression("Address", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointResponse.setAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApplicationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointResponse.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Attributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointResponse.setAttributes(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    ).unmarshall(context));
                }
                if (context.testExpression("ChannelType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointResponse.setChannelType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CohortId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointResponse.setCohortId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointResponse.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Demographic", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointResponse.setDemographic(EndpointDemographicJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EffectiveDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointResponse.setEffectiveDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointResponse.setEndpointStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointResponse.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointResponse.setLocation(EndpointLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Metrics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointResponse.setMetrics(new MapUnmarshaller<String, Double>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Double.class)).unmarshall(context));
                }
                if (context.testExpression("OptOut", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointResponse.setOptOut(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointResponse.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("User", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointResponse.setUser(EndpointUserJsonUnmarshaller.getInstance().unmarshall(context));
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

        return endpointResponse;
    }

    private static EndpointResponseJsonUnmarshaller instance;

    public static EndpointResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointResponseJsonUnmarshaller();
        return instance;
    }
}
