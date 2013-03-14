/*
 * Copyright 2009 Prime Technology.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.sandbox.view;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.sandbox.domain.Car;
import org.primefaces.optimus.config.Scope;
import org.primefaces.optimus.config.annotations.Controller;

@Controller(name="tableBean", scope=Scope.REQUEST)
public class TableBean {

	private List<Car> cars;
	
	public TableBean() {
		cars = new ArrayList<Car>();
		for(int i = 0 ; i < 100 ; i++) {
			cars.add(new Car("Model_" + i, getRandomYear(), "Brand_" + i, "Color_" + i));
		}
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	private int getRandomYear() {
		return (int)(Math.random()*50 + 1960);
	}
}
