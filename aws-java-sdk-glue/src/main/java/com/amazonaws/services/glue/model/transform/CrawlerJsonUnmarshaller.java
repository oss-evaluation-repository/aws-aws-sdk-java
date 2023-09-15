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
 * Crawler JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrawlerJsonUnmarshaller implements Unmarshaller<Crawler, JsonUnmarshallerContext> {

    public Crawler unmarshall(JsonUnmarshallerContext context) throws Exception {
        Crawler crawler = new Crawler();

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
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Targets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setTargets(CrawlerTargetsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Classifiers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setClassifiers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("RecrawlPolicy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setRecrawlPolicy(RecrawlPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SchemaChangePolicy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setSchemaChangePolicy(SchemaChangePolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LineageConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setLineageConfiguration(LineageConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TablePrefix", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setTablePrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schedule", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setSchedule(ScheduleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CrawlElapsedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setCrawlElapsedTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdated", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setLastUpdated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastCrawl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setLastCrawl(LastCrawlInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Configuration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CrawlerSecurityConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setCrawlerSecurityConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LakeFormationConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawler.setLakeFormationConfiguration(LakeFormationConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return crawler;
    }

    private static CrawlerJsonUnmarshaller instance;

    public static CrawlerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CrawlerJsonUnmarshaller();
        return instance;
    }
}
