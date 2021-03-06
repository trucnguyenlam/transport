/**
 * Copyright 2018 LinkedIn Corporation. All rights reserved.
 * Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.transport.presto.types;

import com.linkedin.transport.api.types.StdUnknownType;
import io.prestosql.type.UnknownType;


public class PrestoUnknownType implements StdUnknownType {

  final UnknownType unknownType;

  public PrestoUnknownType(UnknownType unknownType) {
    this.unknownType = unknownType;
  }

  @Override
  public Object underlyingType() {
    return unknownType;
  }
}
