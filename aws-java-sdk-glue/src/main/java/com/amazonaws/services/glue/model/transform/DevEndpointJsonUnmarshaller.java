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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DevEndpoint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DevEndpointJsonUnmarshaller implements Unmarshaller<DevEndpoint, JsonUnmarshallerContext> {

    public DevEndpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        DevEndpoint devEndpoint = new DevEndpoint();

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
                if (context.testExpression("EndpointName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setEndpointName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroupIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("YarnEndpointAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setYarnEndpointAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrivateAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setPrivateAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ZeppelinRemoteSparkInterpreterPort", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setZeppelinRemoteSparkInterpreterPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PublicAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setPublicAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkerType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setWorkerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GlueVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setGlueVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfWorkers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setNumberOfWorkers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfNodes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setNumberOfNodes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExtraPythonLibsS3Path", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setExtraPythonLibsS3Path(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExtraJarsS3Path", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setExtraJarsS3Path(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdateStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setLastUpdateStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setLastModifiedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("PublicKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setPublicKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublicKeys", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setPublicKeys(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SecurityConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setSecurityConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arguments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    devEndpoint.setArguments(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
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

        return devEndpoint;
    }

    private static DevEndpointJsonUnmarshaller instance;

    public static DevEndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DevEndpointJsonUnmarshaller();
        return instance;
    }
}
