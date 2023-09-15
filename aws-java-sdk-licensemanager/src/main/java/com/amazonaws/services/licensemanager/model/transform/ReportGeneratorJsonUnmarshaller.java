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
package com.amazonaws.services.licensemanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReportGenerator JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportGeneratorJsonUnmarshaller implements Unmarshaller<ReportGenerator, JsonUnmarshallerContext> {

    public ReportGenerator unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReportGenerator reportGenerator = new ReportGenerator();

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
                if (context.testExpression("ReportGeneratorName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportGenerator.setReportGeneratorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReportType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportGenerator.setReportType(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ReportContext", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportGenerator.setReportContext(ReportContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReportFrequency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportGenerator.setReportFrequency(ReportFrequencyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LicenseManagerReportGeneratorArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportGenerator.setLicenseManagerReportGeneratorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastRunStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportGenerator.setLastRunStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastRunFailureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportGenerator.setLastRunFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastReportGenerationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportGenerator.setLastReportGenerationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReportCreatorAccount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportGenerator.setReportCreatorAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportGenerator.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportGenerator.setS3Location(S3LocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportGenerator.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportGenerator.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return reportGenerator;
    }

    private static ReportGeneratorJsonUnmarshaller instance;

    public static ReportGeneratorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReportGeneratorJsonUnmarshaller();
        return instance;
    }
}
