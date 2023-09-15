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
package com.amazonaws.services.lambda.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FunctionConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionConfigurationJsonUnmarshaller implements Unmarshaller<FunctionConfiguration, JsonUnmarshallerContext> {

    public FunctionConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        FunctionConfiguration functionConfiguration = new FunctionConfiguration();

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
                if (context.testExpression("FunctionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setFunctionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FunctionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setFunctionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Runtime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setRuntime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Handler", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setHandler(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setCodeSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Timeout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MemorySize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setMemorySize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("LastModified", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setLastModified(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeSha256", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setCodeSha256(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setVpcConfig(VpcConfigResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeadLetterConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setDeadLetterConfig(DeadLetterConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setEnvironment(EnvironmentResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KMSKeyArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setKMSKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TracingConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setTracingConfig(TracingConfigResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MasterArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setMasterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RevisionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setRevisionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Layers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setLayers(new ListUnmarshaller<Layer>(LayerJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setStateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateReasonCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setStateReasonCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdateStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setLastUpdateStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdateStatusReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setLastUpdateStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdateStatusReasonCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setLastUpdateStatusReasonCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileSystemConfigs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setFileSystemConfigs(new ListUnmarshaller<FileSystemConfig>(FileSystemConfigJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PackageType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setPackageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageConfigResponse", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setImageConfigResponse(ImageConfigResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SigningProfileVersionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setSigningProfileVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SigningJobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setSigningJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Architectures", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setArchitectures(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("EphemeralStorage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setEphemeralStorage(EphemeralStorageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SnapStart", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setSnapStart(SnapStartResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RuntimeVersionConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    functionConfiguration.setRuntimeVersionConfig(RuntimeVersionConfigJsonUnmarshaller.getInstance().unmarshall(context));
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

        return functionConfiguration;
    }

    private static FunctionConfigurationJsonUnmarshaller instance;

    public static FunctionConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FunctionConfigurationJsonUnmarshaller();
        return instance;
    }
}
