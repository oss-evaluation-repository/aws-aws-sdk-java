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
package com.amazonaws.services.kinesisfirehose.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeliveryStreamDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliveryStreamDescriptionJsonUnmarshaller implements Unmarshaller<DeliveryStreamDescription, JsonUnmarshallerContext> {

    public DeliveryStreamDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeliveryStreamDescription deliveryStreamDescription = new DeliveryStreamDescription();

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
                if (context.testExpression("DeliveryStreamName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deliveryStreamDescription.setDeliveryStreamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeliveryStreamARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deliveryStreamDescription.setDeliveryStreamARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeliveryStreamStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deliveryStreamDescription.setDeliveryStreamStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deliveryStreamDescription.setFailureDescription(FailureDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeliveryStreamEncryptionConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deliveryStreamDescription.setDeliveryStreamEncryptionConfiguration(DeliveryStreamEncryptionConfigurationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("DeliveryStreamType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deliveryStreamDescription.setDeliveryStreamType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VersionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deliveryStreamDescription.setVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deliveryStreamDescription.setCreateTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdateTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deliveryStreamDescription.setLastUpdateTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Source", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deliveryStreamDescription.setSource(SourceDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Destinations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deliveryStreamDescription
                            .setDestinations(new ListUnmarshaller<DestinationDescription>(DestinationDescriptionJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("HasMoreDestinations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deliveryStreamDescription.setHasMoreDestinations(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return deliveryStreamDescription;
    }

    private static DeliveryStreamDescriptionJsonUnmarshaller instance;

    public static DeliveryStreamDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeliveryStreamDescriptionJsonUnmarshaller();
        return instance;
    }
}
