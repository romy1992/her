package com.stat.bradip.resource.counter.management;

import org.mapstruct.Mapper;

import com.stat.bradip.commons.counter.model.CounterModel;
import com.stat.bradip.commons.counter.model.CounterYearModel;
import com.stat.bradip.commons.counter.model.DifferenceCounterModel;
import com.stat.bradip.resource.counter.entity.Counter;
import com.stat.bradip.resource.counter.entity.CounterYear;
import com.stat.bradip.resource.counter.entity.DifferenceCounter;

@Mapper(componentModel = "spring")
public abstract class MappingMappStruct {

	public abstract CounterModel mappingEntityToModelCounterMonth(Counter entity);

	public abstract Counter mappingModelToEntityCounterMonth(CounterModel model);

	public abstract CounterYearModel mappingEntityToModelCounterYear(CounterYear entity);

	public abstract CounterYear mappingModelToEntityCounterYear(CounterYearModel model);

	public abstract DifferenceCounterModel mappingEntityToModelDifferenceCounter(DifferenceCounter entity);

	public abstract DifferenceCounter mappingModelToEntityDifferenceCounter(DifferenceCounterModel model);
}
