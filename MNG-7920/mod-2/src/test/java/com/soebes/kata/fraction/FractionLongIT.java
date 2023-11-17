package com.soebes.kata.fraction;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * Test for {@link FractionLong}.
 */
class FractionLongIT {

  @Nested
  class Pow {

    @Test
    void power_to_two() {
      FractionLong fraction = new FractionLong(2, 3);

      FractionLong produkt = fraction.pow(2);

      assertThat(produkt).isEqualTo(new FractionLong(4, 9));
    }

    @Test
    void power_to_three() {
      FractionLong fraction = new FractionLong(2, 3);

      FractionLong produkt = fraction.pow(3);

      assertThat(produkt).isEqualTo(new FractionLong(8, 27));
    }

    @Test
    void power_to_ten() {
      FractionLong fraction = new FractionLong(2, 3);

      FractionLong produkt = fraction.pow(10);

      assertThat(produkt).isEqualTo(new FractionLong(1024, 59049));
    }
  }

  @Nested
  class Limits {

    @Test
    void add_max_value() {
      FractionLong summand_1 = new FractionLong(Long.MAX_VALUE / 2, 1);
      FractionLong summand_2 = new FractionLong(Long.MAX_VALUE / 2, 1);

      FractionLong sum = summand_1.plus(summand_2);

      assertThat(sum.numerator()).isEqualTo(Long.MAX_VALUE - 1);
      assertThat(sum.denominator()).isEqualTo(1);
    }

    @Test
    void add_min_value() {
      FractionLong summand_1 = new FractionLong(Long.MIN_VALUE / 2, 1);
      FractionLong summand_2 = new FractionLong(Long.MIN_VALUE / 2, 1);

      FractionLong sum = summand_1.plus(summand_2);

      assertThat(sum.numerator()).isEqualTo(Long.MIN_VALUE);
      assertThat(sum.denominator()).isEqualTo(1);
    }

  }
}
