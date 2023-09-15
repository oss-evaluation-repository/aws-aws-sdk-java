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
package com.amazonaws.services.alexaforbusiness.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.alexaforbusiness.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BusinessReport JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BusinessReportJsonUnmarshaller implements Unmarshaller<BusinessReport, JsonUnmarshallerContext> {

    public BusinessReport unmarshall(JsonUnmarshallerContext context) throws Exception {
        BusinessReport businessReport = new BusinessReport();

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
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    businessReport.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    businessReport.setFailureCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    businessReport.setS3Location(BusinessReportS3LocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeliveryTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    businessReport.setDeliveryTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DownloadUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    businessReport.setDownloadUrl(context.getUnmarshaller(String.class).unmarshall(context));
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

        return businessReport;
    }

    private static BusinessReportJsonUnmarshaller instance;

    public static BusinessReportJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BusinessReportJsonUnmarshaller();
        return instance;
    }
}
