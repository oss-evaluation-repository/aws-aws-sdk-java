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
package com.amazonaws.services.snowball.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobMetadataJsonUnmarshaller implements Unmarshaller<JobMetadata, JsonUnmarshallerContext> {

    public JobMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobMetadata jobMetadata = new JobMetadata();

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
                if (context.testExpression("JobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setJobState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setJobType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnowballType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setSnowballType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Resources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setResources(JobResourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setKmsKeyARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setRoleARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AddressId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setAddressId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ShippingDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setShippingDetails(ShippingDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SnowballCapacityPreference", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setSnowballCapacityPreference(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Notification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setNotification(NotificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataTransferProgress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setDataTransferProgress(DataTransferJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobLogInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setJobLogInfo(JobLogsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ClusterId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setClusterId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ForwardingAddressId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setForwardingAddressId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaxDocuments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setTaxDocuments(TaxDocumentsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeviceConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setDeviceConfiguration(DeviceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RemoteManagement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setRemoteManagement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LongTermPricingId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setLongTermPricingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OnDeviceServiceConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setOnDeviceServiceConfiguration(OnDeviceServiceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ImpactLevel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setImpactLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PickupDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setPickupDetails(PickupDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SnowballId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobMetadata.setSnowballId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return jobMetadata;
    }

    private static JobMetadataJsonUnmarshaller instance;

    public static JobMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobMetadataJsonUnmarshaller();
        return instance;
    }
}
