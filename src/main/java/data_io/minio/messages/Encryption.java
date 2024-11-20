/*
 * MinIO Java SDK for Amazon S3 Compatible Cloud Storage, (C) 2021 MinIO, Inc.
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

package data_io.minio.messages;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Objects;

/** Helper class to denote encryption information of {@link S3OutputLocation}. */
@Root(name = "Encryption")

public class Encryption {
  @Element(name = "EncryptionType")
  private SseAlgorithm encryptionType;

  @Element(name = "KMSContext", required = false)
  private String kmsContext;

  @Element(name = "KMSKeyId", required = false)
  private String kmsKeyId;

  public Encryption(
      @Nonnull SseAlgorithm encryptionType,
      @Nullable String kmsContext,
      @Nullable String kmsKeyId) {
    this.encryptionType =
        Objects.requireNonNull(encryptionType, "Encryption type must not be null");
    this.kmsContext = kmsContext;
    this.kmsKeyId = kmsKeyId;
  }
}
