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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsApiGatewayStageDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiGatewayStageDetailsJsonUnmarshaller implements Unmarshaller<AwsApiGatewayStageDetails, JsonUnmarshallerContext> {

    public AwsApiGatewayStageDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsApiGatewayStageDetails awsApiGatewayStageDetails = new AwsApiGatewayStageDetails();

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
                if (context.testExpression("DeploymentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientCertificateId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setClientCertificateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StageName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setStageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CacheClusterEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setCacheClusterEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CacheClusterSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setCacheClusterSize(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CacheClusterStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setCacheClusterStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MethodSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setMethodSettings(new ListUnmarshaller<AwsApiGatewayMethodSettings>(AwsApiGatewayMethodSettingsJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Variables", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setVariables(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("DocumentationVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setDocumentationVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccessLogSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setAccessLogSettings(AwsApiGatewayAccessLogSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CanarySettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setCanarySettings(AwsApiGatewayCanarySettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TracingEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setTracingEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setCreatedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdatedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setLastUpdatedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WebAclArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsApiGatewayStageDetails.setWebAclArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return awsApiGatewayStageDetails;
    }

    private static AwsApiGatewayStageDetailsJsonUnmarshaller instance;

    public static AwsApiGatewayStageDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsApiGatewayStageDetailsJsonUnmarshaller();
        return instance;
    }
}
