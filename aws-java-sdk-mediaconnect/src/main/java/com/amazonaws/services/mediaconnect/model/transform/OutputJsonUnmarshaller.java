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
package com.amazonaws.services.mediaconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Output JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputJsonUnmarshaller implements Unmarshaller<Output, JsonUnmarshallerContext> {

    public Output unmarshall(JsonUnmarshallerContext context) throws Exception {
        Output output = new Output();

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
                if (context.testExpression("dataTransferSubscriberFeePercent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    output.setDataTransferSubscriberFeePercent(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    output.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destination", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    output.setDestination(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encryption", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    output.setEncryption(EncryptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("entitlementArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    output.setEntitlementArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("listenerAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    output.setListenerAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mediaLiveInputArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    output.setMediaLiveInputArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mediaStreamOutputConfigurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    output.setMediaStreamOutputConfigurations(new ListUnmarshaller<MediaStreamOutputConfiguration>(
                            MediaStreamOutputConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    output.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    output.setOutputArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("port", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    output.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("transport", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    output.setTransport(TransportJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("vpcInterfaceAttachment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    output.setVpcInterfaceAttachment(VpcInterfaceAttachmentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("bridgeArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    output.setBridgeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bridgePorts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    output.setBridgePorts(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))

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

        return output;
    }

    private static OutputJsonUnmarshaller instance;

    public static OutputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OutputJsonUnmarshaller();
        return instance;
    }
}
