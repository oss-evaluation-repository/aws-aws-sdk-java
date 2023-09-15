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
package com.amazonaws.services.iotfleetwise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotfleetwise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetCampaignResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCampaignResultJsonUnmarshaller implements Unmarshaller<GetCampaignResult, JsonUnmarshallerContext> {

    public GetCampaignResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCampaignResult getCampaignResult = new GetCampaignResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getCampaignResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("signalCatalogArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setSignalCatalogArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setTargetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("expiryTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setExpiryTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("postTriggerCollectionDuration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setPostTriggerCollectionDuration(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("diagnosticsMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setDiagnosticsMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("spoolingMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setSpoolingMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("compression", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setCompression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("priority", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("signalsToCollect", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setSignalsToCollect(new ListUnmarshaller<SignalInformation>(SignalInformationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("collectionScheme", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setCollectionScheme(CollectionSchemeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dataExtraDimensions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setDataExtraDimensions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModificationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("dataDestinationConfigs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCampaignResult
                            .setDataDestinationConfigs(new ListUnmarshaller<DataDestinationConfig>(DataDestinationConfigJsonUnmarshaller.getInstance())

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

        return getCampaignResult;
    }

    private static GetCampaignResultJsonUnmarshaller instance;

    public static GetCampaignResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCampaignResultJsonUnmarshaller();
        return instance;
    }
}
