/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.monitor;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.monitor.implementation.DiagnosticSettingsInner;
import com.microsoft.azure.management.monitor.implementation.MonitorManager;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsBatchDeletion;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasManager;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsBatchCreation;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsCreating;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsDeletingById;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import rx.Completable;
import rx.Observable;

import java.util.List;

/**
 * Entry point for diagnostic settings management API.
 */
@Beta(Beta.SinceVersion.V1_8_0)
@Fluent
public interface DiagnosticSettings extends
        SupportsCreating<DiagnosticSetting.DefinitionStages.Blank>,
        SupportsBatchCreation<DiagnosticSetting>,
        SupportsGettingById<DiagnosticSetting>,
        SupportsDeletingById,
        SupportsBatchDeletion,
        HasManager<MonitorManager>,
        HasInner<DiagnosticSettingsInner> {

    /**
     * Lists all the Diagnostic Settings categories for Log and Metric Settings for a specific resource.
     *
     * @param resourceId of the requested resource.
     * @return list of Diagnostic Settings category available for the resource.
     */
    List<DiagnosticSettingsCategory> listCategoriesByResource(String resourceId);

    /**
     * Lists all the Diagnostic Settings categories for Log and Metric Settings for a specific resource.
     *
     * @param resourceId of the requested resource.
     * @return list of Diagnostic Settings category available for the resource.
     */
    Observable<DiagnosticSettingsCategory> listCategoriesByResourceAsync(String resourceId);

    /**
     * Gets the information about Diagnostic Setting category for Log or Metric Setting for a specific resource.
     *
     * @param resourceId of the requested resource.
     * @param name of the Log or Metric category.
     * @return Diagnostic Setting category available for the resource.
     */
    DiagnosticSettingsCategory getCategory(String resourceId, String name);

    /**
     * Gets the information about Diagnostic Setting category for Log or Metric Setting for a specific resource.
     *
     * @param resourceId of the requested resource.
     * @param name of the Log or Metric category.
     * @return Diagnostic Setting category available for the resource.
     */
    Observable<DiagnosticSettingsCategory> getCategoryAsync(String resourceId, String name);

    /**
     * Lists all the diagnostic settings in the currently selected subscription for a specific resource.
     *
     * @param resourceId that Diagnostic Setting is associated with.
     * @return list of resources
     */
    PagedList<DiagnosticSetting> listByResource(String resourceId);

    /**
     * Lists all the diagnostic settings in the currently selected subscription for a specific resource.
     *
     * @param resourceId that Diagnostic Setting is associated with.
     * @return list of resources
     */
    Observable<DiagnosticSetting> listByResourceAsync(String resourceId);

    /**
     * Deletes a Diagnostic Setting from Azure, identifying it by its resourceId and name.
     *
     * @param resourceId that Diagnostic Setting is associated with.
     * @param name the name of Diagnostic Setting.
     */
    void delete(String resourceId, String name);

    /**
     * Asynchronously delete a Diagnostic Setting from Azure, identifying it by its resourceId and name.
     *
     * @param resourceId that Diagnostic Setting is associated with.
     * @param name the name of Diagnostic Setting.
     * @param callback the callback on success or failure
     * @return a handle to cancel the request
     */
    ServiceFuture<Void> deleteAsync(String resourceId, String name, ServiceCallback<Void> callback);

    /**
     * Asynchronously delete a Diagnostic Setting from Azure, identifying it by its resourceId and name.
     *
     * @param resourceId that Diagnostic Setting is associated with.
     * @param name the name of Diagnostic Setting.
     * @return a representation of the deferred computation of this call
     */
    Completable deleteAsync(String resourceId, String name);

    /**
     * Gets the information about Diagnostic Setting from Azure based on the resource id and setting name.
     *
     * @param resourceId that Diagnostic Setting is associated with.
     * @param name the name of Diagnostic Setting.
     * @return an immutable representation of the resource
     */
    DiagnosticSetting get(String resourceId, String name);

    /**
     * Gets the information about Diagnostic Setting from Azure based on the resource id and setting name.
     *
     * @param resourceId that Diagnostic Setting is associated with.
     * @param name the name of Diagnostic Setting.
     * @return an immutable representation of the resource
     */
    Observable<DiagnosticSetting> getAsync(String resourceId, String name);
}
