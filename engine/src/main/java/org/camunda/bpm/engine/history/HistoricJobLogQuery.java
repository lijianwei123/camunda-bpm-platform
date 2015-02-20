/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.engine.history;

import org.camunda.bpm.engine.query.Query;

/**
 * @author Roman Smirnov
 *
 */
public interface HistoricJobLogQuery extends Query<HistoricJobLogQuery, HistoricJobLog> {

  /** Only select historic job log entries with the id. */
  HistoricJobLogQuery logId(String logId);

  /** Only select historic job log entries with the given job id. */
  HistoricJobLogQuery jobId(String jobId);

  /** Only select historic job log entries with the given exception message. */
  HistoricJobLogQuery jobExceptionMessage(String exceptionMessage);

  /** Only select historic job log entries with the given job definition id. */
  HistoricJobLogQuery jobDefinitionId(String jobDefinitionId);

  /** Only select historic job log entries with the given job definition type. */
  HistoricJobLogQuery jobDefinitionType(String jobDefinitionType);

  /** Only select historic job log entries with the given job definition configuration type. */
  HistoricJobLogQuery jobDefinitionConfiguration(String jobDefinitionConfiguration);

  /** Only select historic job log entries which are associated with one of the given activity ids. **/
  HistoricJobLogQuery activityIdIn(String... activityIds);

  /** Only select historic job log entries which are associated with one of the given execution ids. **/
  HistoricJobLogQuery executionIdIn(String... executionIds);

  /** Only select historic job log entries with the process instance id. */
  HistoricJobLogQuery processInstanceId(String processInstanceId);

  /** Only select historic job log entries with the process definition id. */
  HistoricJobLogQuery processDefinitionId(String processDefinitionId);

  /** Only select historic job log entries with the process instance key. */
  HistoricJobLogQuery processDefinitionKey(String processDefinitionKey);

  /** Only select historic job log entries with the deployment id. */
  HistoricJobLogQuery deploymentId(String deploymentId);

  /** Only select created historic job log entries. */
  HistoricJobLogQuery creationLog();

  /** Only select failed historic job log entries. */
  HistoricJobLogQuery failureLog();

  /**
   * Only select historic job logs which belongs to a
   * <code>successful</code> executed job.
   */
  HistoricJobLogQuery successLog();

  /** Only select deleted historic job log entries. */
  HistoricJobLogQuery deletionLog();

  /** Order by timestamp (needs to be followed by {@link #asc()} or {@link #desc()}). */
  HistoricJobLogQuery orderByTimestamp();

  /** Order by job id (needs to be followed by {@link #asc()} or {@link #desc()}). */
  HistoricJobLogQuery orderByJobId();

  /** Order by job due date (needs to be followed by {@link #asc()} or {@link #desc()}). */
  HistoricJobLogQuery orderByJobDueDate();

  /** Order by job retries (needs to be followed by {@link #asc()} or {@link #desc()}). */
  HistoricJobLogQuery orderByJobRetries();

  /** Order by job definition id (needs to be followed by {@link #asc()} or {@link #desc()}). */
  HistoricJobLogQuery orderByJobDefinitionId();

  /** Order by activity id (needs to be followed by {@link #asc()} or {@link #desc()}). */
  HistoricJobLogQuery orderByActivityId();

  /** Order by execution id (needs to be followed by {@link #asc()} or {@link #desc()}). */
  HistoricJobLogQuery orderByExecutionId();

  /** Order by process instance id (needs to be followed by {@link #asc()} or {@link #desc()}). */
  HistoricJobLogQuery orderByProcessInstanceId();

  /** Order by process definition id (needs to be followed by {@link #asc()} or {@link #desc()}). */
  HistoricJobLogQuery orderByProcessDefinitionId();

  /** Order by process definition key (needs to be followed by {@link #asc()} or {@link #desc()}). */
  HistoricJobLogQuery orderByProcessDefinitionKey();

  /** Order by deployment id (needs to be followed by {@link #asc()} or {@link #desc()}). */
  HistoricJobLogQuery orderByDeploymentId();

}
