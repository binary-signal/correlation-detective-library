/*
 * MinIO Java SDK for Amazon S3 Compatible Cloud Storage, (C) 2020 MinIO, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package data_io.minio;

import data_io.minio.messages.ListPartsResult;
import okhttp3.Headers;

/** Response class of {@link S3Base#listPartsAsync}. */
public class ListPartsResponse extends GenericResponse {
  private ListPartsResult result;

  public ListPartsResponse(
      Headers headers, String bucket, String region, String object, ListPartsResult result) {
    super(headers, bucket, region, object);
    this.result = result;
  }

  public ListPartsResult result() {
    return result;
  }
}
