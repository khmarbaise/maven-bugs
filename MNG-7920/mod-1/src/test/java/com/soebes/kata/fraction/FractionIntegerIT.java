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
 * Test for {@link FractionInteger}.
 */
class FractionIntegerIT {

  @Nested
  class Pow {

    @Test
    void power_to_two() {
      FractionInteger fractionInteger = new FractionInteger(2, 3);

      FractionInteger produkt = fractionInteger.pow(2);

      assertThat(produkt).isEqualTo(new FractionInteger(4, 9));
    }

    @Test
    void power_to_three() {
      FractionInteger fractionInteger = new FractionInteger(2, 3);

      FractionInteger produkt = fractionInteger.pow(3);

      assertThat(produkt).isEqualTo(new FractionInteger(8, 27));
    }

    @Test
    void power_to_ten() {
      FractionInteger fractionInteger = new FractionInteger(2, 3);

      FractionInteger produkt = fractionInteger.pow(10);

      assertThat(produkt).isEqualTo(new FractionInteger(1024, 59049));
    }
  }

  @Nested
  class Limits {

    @Test
    void add_max_value() {
      FractionInteger summand_1 = new FractionInteger(Integer.MAX_VALUE / 2, 1);
      FractionInteger summand_2 = new FractionInteger(Integer.MAX_VALUE / 2, 1);

      FractionInteger sum = summand_1.plus(summand_2);

      assertThat(sum.numerator()).isEqualTo(Integer.MAX_VALUE - 1);
      assertThat(sum.denominator()).isEqualTo(1);
    }

    @Test
    void add_min_value() {
      FractionInteger summand_1 = new FractionInteger(Integer.MIN_VALUE / 2, 1);
      FractionInteger summand_2 = new FractionInteger(Integer.MIN_VALUE / 2, 1);

      FractionInteger sum = summand_1.plus(summand_2);

      assertThat(sum.numerator()).isEqualTo(Integer.MIN_VALUE);
      assertThat(sum.denominator()).isEqualTo(1);
    }

  }
}
