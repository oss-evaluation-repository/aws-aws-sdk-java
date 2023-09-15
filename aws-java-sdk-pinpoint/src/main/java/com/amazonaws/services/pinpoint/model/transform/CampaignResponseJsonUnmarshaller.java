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
 * CampaignResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignResponseJsonUnmarshaller implements Unmarshaller<CampaignResponse, JsonUnmarshallerContext> {

    public CampaignResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        CampaignResponse campaignResponse = new CampaignResponse();

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
                if (context.testExpression("AdditionalTreatments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setAdditionalTreatments(new ListUnmarshaller<TreatmentResource>(TreatmentResourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ApplicationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomDeliveryConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setCustomDeliveryConfiguration(CustomDeliveryConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setDefaultState(CampaignStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HoldoutPercent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setHoldoutPercent(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Hook", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setHook(CampaignHookJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsPaused", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setIsPaused(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setLastModifiedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Limits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setLimits(CampaignLimitsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MessageConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setMessageConfiguration(MessageConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schedule", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setSchedule(ScheduleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SegmentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setSegmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SegmentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setSegmentVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setState(CampaignStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("TemplateConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setTemplateConfiguration(TemplateConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TreatmentDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setTreatmentDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TreatmentName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setTreatmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Priority", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    campaignResponse.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return campaignResponse;
    }

    private static CampaignResponseJsonUnmarshaller instance;

    public static CampaignResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CampaignResponseJsonUnmarshaller();
        return instance;
    }
}
