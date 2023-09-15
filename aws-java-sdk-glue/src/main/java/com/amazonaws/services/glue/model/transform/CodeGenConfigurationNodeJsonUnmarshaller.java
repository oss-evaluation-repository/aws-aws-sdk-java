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
 * CodeGenConfigurationNode JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeGenConfigurationNodeJsonUnmarshaller implements Unmarshaller<CodeGenConfigurationNode, JsonUnmarshallerContext> {

    public CodeGenConfigurationNode unmarshall(JsonUnmarshallerContext context) throws Exception {
        CodeGenConfigurationNode codeGenConfigurationNode = new CodeGenConfigurationNode();

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
                if (context.testExpression("AthenaConnectorSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setAthenaConnectorSource(AthenaConnectorSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JDBCConnectorSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setJDBCConnectorSource(JDBCConnectorSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SparkConnectorSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setSparkConnectorSource(SparkConnectorSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CatalogSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setCatalogSource(CatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RedshiftSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setRedshiftSource(RedshiftSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3CatalogSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setS3CatalogSource(S3CatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3CsvSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setS3CsvSource(S3CsvSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3JsonSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setS3JsonSource(S3JsonSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3ParquetSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setS3ParquetSource(S3ParquetSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RelationalCatalogSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setRelationalCatalogSource(RelationalCatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DynamoDBCatalogSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setDynamoDBCatalogSource(DynamoDBCatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JDBCConnectorTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setJDBCConnectorTarget(JDBCConnectorTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SparkConnectorTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setSparkConnectorTarget(SparkConnectorTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CatalogTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setCatalogTarget(BasicCatalogTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RedshiftTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setRedshiftTarget(RedshiftTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3CatalogTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setS3CatalogTarget(S3CatalogTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3GlueParquetTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setS3GlueParquetTarget(S3GlueParquetTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3DirectTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setS3DirectTarget(S3DirectTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ApplyMapping", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setApplyMapping(ApplyMappingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SelectFields", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setSelectFields(SelectFieldsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DropFields", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setDropFields(DropFieldsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RenameField", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setRenameField(RenameFieldJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Spigot", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setSpigot(SpigotJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Join", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setJoin(JoinJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SplitFields", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setSplitFields(SplitFieldsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SelectFromCollection", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setSelectFromCollection(SelectFromCollectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FillMissingValues", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setFillMissingValues(FillMissingValuesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Filter", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setFilter(FilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setCustomCode(CustomCodeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SparkSQL", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setSparkSQL(SparkSQLJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DirectKinesisSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setDirectKinesisSource(DirectKinesisSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DirectKafkaSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setDirectKafkaSource(DirectKafkaSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CatalogKinesisSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setCatalogKinesisSource(CatalogKinesisSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CatalogKafkaSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setCatalogKafkaSource(CatalogKafkaSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DropNullFields", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setDropNullFields(DropNullFieldsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Merge", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setMerge(MergeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Union", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setUnion(UnionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PIIDetection", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setPIIDetection(PIIDetectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Aggregate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setAggregate(AggregateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DropDuplicates", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setDropDuplicates(DropDuplicatesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GovernedCatalogTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setGovernedCatalogTarget(GovernedCatalogTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GovernedCatalogSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setGovernedCatalogSource(GovernedCatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MicrosoftSQLServerCatalogSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setMicrosoftSQLServerCatalogSource(MicrosoftSQLServerCatalogSourceJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("MySQLCatalogSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setMySQLCatalogSource(MySQLCatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OracleSQLCatalogSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setOracleSQLCatalogSource(OracleSQLCatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PostgreSQLCatalogSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setPostgreSQLCatalogSource(PostgreSQLCatalogSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MicrosoftSQLServerCatalogTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setMicrosoftSQLServerCatalogTarget(MicrosoftSQLServerCatalogTargetJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("MySQLCatalogTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setMySQLCatalogTarget(MySQLCatalogTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OracleSQLCatalogTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setOracleSQLCatalogTarget(OracleSQLCatalogTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PostgreSQLCatalogTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setPostgreSQLCatalogTarget(PostgreSQLCatalogTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DynamicTransform", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setDynamicTransform(DynamicTransformJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EvaluateDataQuality", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setEvaluateDataQuality(EvaluateDataQualityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3CatalogHudiSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setS3CatalogHudiSource(S3CatalogHudiSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CatalogHudiSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setCatalogHudiSource(CatalogHudiSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3HudiSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setS3HudiSource(S3HudiSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3HudiCatalogTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setS3HudiCatalogTarget(S3HudiCatalogTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3HudiDirectTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setS3HudiDirectTarget(S3HudiDirectTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DirectJDBCSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setDirectJDBCSource(DirectJDBCSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3CatalogDeltaSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setS3CatalogDeltaSource(S3CatalogDeltaSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CatalogDeltaSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setCatalogDeltaSource(CatalogDeltaSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3DeltaSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setS3DeltaSource(S3DeltaSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3DeltaCatalogTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setS3DeltaCatalogTarget(S3DeltaCatalogTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3DeltaDirectTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setS3DeltaDirectTarget(S3DeltaDirectTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AmazonRedshiftSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setAmazonRedshiftSource(AmazonRedshiftSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AmazonRedshiftTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setAmazonRedshiftTarget(AmazonRedshiftTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EvaluateDataQualityMultiFrame", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setEvaluateDataQualityMultiFrame(EvaluateDataQualityMultiFrameJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Recipe", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setRecipe(RecipeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SnowflakeSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setSnowflakeSource(SnowflakeSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SnowflakeTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeGenConfigurationNode.setSnowflakeTarget(SnowflakeTargetJsonUnmarshaller.getInstance().unmarshall(context));
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

        return codeGenConfigurationNode;
    }

    private static CodeGenConfigurationNodeJsonUnmarshaller instance;

    public static CodeGenConfigurationNodeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CodeGenConfigurationNodeJsonUnmarshaller();
        return instance;
    }
}
