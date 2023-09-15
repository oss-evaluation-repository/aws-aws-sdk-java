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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsLambdaFunctionDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsLambdaFunctionDetailsJsonUnmarshaller implements Unmarshaller<AwsLambdaFunctionDetails, JsonUnmarshallerContext> {

    public AwsLambdaFunctionDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsLambdaFunctionDetails awsLambdaFunctionDetails = new AwsLambdaFunctionDetails();

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
                if (context.testExpression("architectures", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsLambdaFunctionDetails.setArchitectures(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("codeSha256", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsLambdaFunctionDetails.setCodeSha256(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executionRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsLambdaFunctionDetails.setExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("functionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsLambdaFunctionDetails.setFunctionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsLambdaFunctionDetails.setLastModifiedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("layers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsLambdaFunctionDetails.setLayers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("packageType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsLambdaFunctionDetails.setPackageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("runtime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsLambdaFunctionDetails.setRuntime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsLambdaFunctionDetails.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsLambdaFunctionDetails.setVpcConfig(LambdaVpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
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

        return awsLambdaFunctionDetails;
    }

    private static AwsLambdaFunctionDetailsJsonUnmarshaller instance;

    public static AwsLambdaFunctionDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsLambdaFunctionDetailsJsonUnmarshaller();
        return instance;
    }
}
