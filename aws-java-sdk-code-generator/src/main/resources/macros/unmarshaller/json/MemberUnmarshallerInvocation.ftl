<#macro content shapeVarName memberModel packageName="" >
if (context.testExpression("${memberModel.http.unmarshallLocationName}", targetDepth)) {
    knownMember = true;
    context.nextToken();
    ${shapeVarName}.${memberModel.setterMethodName}(<@MemberUnmarshallerDeclarationMacro.content memberModel packageName/>.unmarshall(context));
}
</#macro>
