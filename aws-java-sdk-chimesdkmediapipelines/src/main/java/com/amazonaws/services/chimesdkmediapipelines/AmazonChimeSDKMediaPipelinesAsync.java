/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmediapipelines;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmediapipelines.model.*;

/**
 * Interface for accessing Amazon Chime SDK Media Pipelines asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chimesdkmediapipelines.AbstractAmazonChimeSDKMediaPipelinesAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Chime SDK media pipeline APIs in this section allow software developers to create Amazon Chime SDK media
 * pipelines and capture audio, video, events, and data messages from Amazon Chime SDK meetings. For more information
 * about media pipleines, see <a
 * href="https://docs.aws.amazon.com/chime/latest/APIReference/API_Operations_Amazon_Chime_SDK_Media_Pipelines.html"
 * >Amzon Chime SDK media pipelines</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonChimeSDKMediaPipelinesAsync extends AmazonChimeSDKMediaPipelines {

    /**
     * <p>
     * Creates a media capture pipeline.
     * </p>
     * 
     * @param createMediaCapturePipelineRequest
     * @return A Java Future containing the result of the CreateMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.CreateMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaCapturePipelineResult> createMediaCapturePipelineAsync(
            CreateMediaCapturePipelineRequest createMediaCapturePipelineRequest);

    /**
     * <p>
     * Creates a media capture pipeline.
     * </p>
     * 
     * @param createMediaCapturePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.CreateMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaCapturePipelineResult> createMediaCapturePipelineAsync(
            CreateMediaCapturePipelineRequest createMediaCapturePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMediaCapturePipelineRequest, CreateMediaCapturePipelineResult> asyncHandler);

    /**
     * <p>
     * Deletes the media capture pipeline.
     * </p>
     * 
     * @param deleteMediaCapturePipelineRequest
     * @return A Java Future containing the result of the DeleteMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.DeleteMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaCapturePipelineResult> deleteMediaCapturePipelineAsync(
            DeleteMediaCapturePipelineRequest deleteMediaCapturePipelineRequest);

    /**
     * <p>
     * Deletes the media capture pipeline.
     * </p>
     * 
     * @param deleteMediaCapturePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.DeleteMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaCapturePipelineResult> deleteMediaCapturePipelineAsync(
            DeleteMediaCapturePipelineRequest deleteMediaCapturePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMediaCapturePipelineRequest, DeleteMediaCapturePipelineResult> asyncHandler);

    /**
     * <p>
     * Gets an existing media capture pipeline.
     * </p>
     * 
     * @param getMediaCapturePipelineRequest
     * @return A Java Future containing the result of the GetMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.GetMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaCapturePipelineResult> getMediaCapturePipelineAsync(GetMediaCapturePipelineRequest getMediaCapturePipelineRequest);

    /**
     * <p>
     * Gets an existing media capture pipeline.
     * </p>
     * 
     * @param getMediaCapturePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.GetMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaCapturePipelineResult> getMediaCapturePipelineAsync(GetMediaCapturePipelineRequest getMediaCapturePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<GetMediaCapturePipelineRequest, GetMediaCapturePipelineResult> asyncHandler);

    /**
     * <p>
     * Returns a list of media capture pipelines.
     * </p>
     * 
     * @param listMediaCapturePipelinesRequest
     * @return A Java Future containing the result of the ListMediaCapturePipelines operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.ListMediaCapturePipelines
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaCapturePipelines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaCapturePipelinesResult> listMediaCapturePipelinesAsync(
            ListMediaCapturePipelinesRequest listMediaCapturePipelinesRequest);

    /**
     * <p>
     * Returns a list of media capture pipelines.
     * </p>
     * 
     * @param listMediaCapturePipelinesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMediaCapturePipelines operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.ListMediaCapturePipelines
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaCapturePipelines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaCapturePipelinesResult> listMediaCapturePipelinesAsync(
            ListMediaCapturePipelinesRequest listMediaCapturePipelinesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMediaCapturePipelinesRequest, ListMediaCapturePipelinesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK media capture pipeline.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK media capture pipeline.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK media capture pipeline.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK media capture pipeline.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from the specified Amazon Chime SDK media capture pipeline.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified Amazon Chime SDK media capture pipeline.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
