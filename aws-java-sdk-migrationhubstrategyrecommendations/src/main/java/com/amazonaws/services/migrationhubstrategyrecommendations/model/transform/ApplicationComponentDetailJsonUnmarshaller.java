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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ApplicationComponentDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationComponentDetailJsonUnmarshaller implements Unmarshaller<ApplicationComponentDetail, JsonUnmarshallerContext> {

    public ApplicationComponentDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ApplicationComponentDetail applicationComponentDetail = new ApplicationComponentDetail();

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
                if (context.testExpression("analysisStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setAnalysisStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("antipatternReportS3Object", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setAntipatternReportS3Object(S3ObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("antipatternReportStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setAntipatternReportStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("antipatternReportStatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setAntipatternReportStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("appType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setAppType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("appUnitError", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setAppUnitError(AppUnitErrorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("associatedServerId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setAssociatedServerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("databaseConfigDetail", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setDatabaseConfigDetail(DatabaseConfigDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inclusionStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setInclusionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastAnalyzedTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setLastAnalyzedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("listAntipatternSeveritySummary", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setListAntipatternSeveritySummary(new ListUnmarshaller<AntipatternSeveritySummary>(
                            AntipatternSeveritySummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("moreServerAssociationExists", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setMoreServerAssociationExists(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("osDriver", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setOsDriver(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("osVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setOsVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recommendationSet", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setRecommendationSet(RecommendationSetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceSubType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setResourceSubType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resultList", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setResultList(new ListUnmarshaller<Result>(ResultJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("runtimeStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setRuntimeStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("runtimeStatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setRuntimeStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceCodeRepositories", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setSourceCodeRepositories(new ListUnmarshaller<SourceCodeRepository>(SourceCodeRepositoryJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationComponentDetail.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
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

        return applicationComponentDetail;
    }

    private static ApplicationComponentDetailJsonUnmarshaller instance;

    public static ApplicationComponentDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationComponentDetailJsonUnmarshaller();
        return instance;
    }
}
