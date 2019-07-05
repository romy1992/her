package com.stat.bradip.resource.counter.management;

import com.stat.bradip.commons.counter.model.CounterDatFileMonthModel;
import com.stat.bradip.commons.counter.model.CounterModel;
import com.stat.bradip.commons.counter.model.CounterYearModel;
import com.stat.bradip.commons.counter.model.DifferenceCounterModel;
import com.stat.bradip.commons.counter.model.SessionMonthCounterModel;
import com.stat.bradip.commons.counter.model.SpecificDifferenceModel;
import com.stat.bradip.resource.counter.entity.Counter;
import com.stat.bradip.resource.counter.entity.CounterDatFileMonth;
import com.stat.bradip.resource.counter.entity.CounterYear;
import com.stat.bradip.resource.counter.entity.DifferenceCounter;
import com.stat.bradip.resource.counter.entity.SessionMonthCounter;
import com.stat.bradip.resource.counter.entity.SpecificDifference;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-07-05T12:05:59+0200",
    comments = "version: 1.3.0.Beta2, compiler: Eclipse JDT (IDE) 3.16.0.v20181130-1748, environment: Java 1.8.0_211 (Oracle Corporation)"
)
@Component
public class MappingMappStructImpl extends MappingMappStruct {

    @Override
    public CounterModel mappingEntityToModelCounterMonth(Counter entity) {
        if ( entity == null ) {
            return null;
        }

        CounterModel counterModel = new CounterModel();

        counterModel.setCounterDatFile( counterDatFileMonthListToCounterDatFileMonthModelList( entity.getCounterDatFile() ) );
        counterModel.setIdCounter( entity.getIdCounter() );
        counterModel.setIdCustomer( entity.getIdCustomer() );
        counterModel.setIdFile( entity.getIdFile() );

        return counterModel;
    }

    @Override
    public Counter mappingModelToEntityCounterMonth(CounterModel model) {
        if ( model == null ) {
            return null;
        }

        Counter counter = new Counter();

        counter.setIdCounter( model.getIdCounter() );
        counter.setIdCustomer( model.getIdCustomer() );
        counter.setIdFile( model.getIdFile() );
        counter.setCounterDatFile( counterDatFileMonthModelListToCounterDatFileMonthList( model.getCounterDatFile() ) );

        return counter;
    }

    @Override
    public CounterYearModel mappingEntityToModelCounterYear(CounterYear entity) {
        if ( entity == null ) {
            return null;
        }

        CounterYearModel counterYearModel = new CounterYearModel();

        counterYearModel.setIdYearCounter( entity.getIdYearCounter() );
        counterYearModel.setSessionMounthList( sessionMonthCounterListToSessionMonthCounterModelList( entity.getSessionMounthList() ) );
        counterYearModel.setStringYear( entity.getStringYear() );
        counterYearModel.setYear( entity.getYear() );

        return counterYearModel;
    }

    @Override
    public CounterYear mappingModelToEntityCounterYear(CounterYearModel model) {
        if ( model == null ) {
            return null;
        }

        CounterYear counterYear = new CounterYear();

        counterYear.setIdYearCounter( model.getIdYearCounter() );
        counterYear.setYear( model.getYear() );
        counterYear.setStringYear( model.getStringYear() );
        counterYear.setSessionMounthList( sessionMonthCounterModelListToSessionMonthCounterList( model.getSessionMounthList() ) );

        return counterYear;
    }

    @Override
    public DifferenceCounterModel mappingEntityToModelDifferenceCounter(DifferenceCounter entity) {
        if ( entity == null ) {
            return null;
        }

        DifferenceCounterModel differenceCounterModel = new DifferenceCounterModel();

        differenceCounterModel.setDescription( entity.getDescription() );
        differenceCounterModel.setIdCustomer( entity.getIdCustomer() );
        differenceCounterModel.setIdDifference( entity.getIdDifference() );
        differenceCounterModel.setSpecificDifferenceList( specificDifferenceListToSpecificDifferenceModelList( entity.getSpecificDifferenceList() ) );

        return differenceCounterModel;
    }

    @Override
    public DifferenceCounter mappingModelToEntityDifferenceCounter(DifferenceCounterModel model) {
        if ( model == null ) {
            return null;
        }

        DifferenceCounter differenceCounter = new DifferenceCounter();

        differenceCounter.setIdDifference( model.getIdDifference() );
        differenceCounter.setIdCustomer( model.getIdCustomer() );
        differenceCounter.setDescription( model.getDescription() );
        differenceCounter.setSpecificDifferenceList( specificDifferenceModelListToSpecificDifferenceList( model.getSpecificDifferenceList() ) );

        return differenceCounter;
    }

    protected CounterDatFileMonthModel counterDatFileMonthToCounterDatFileMonthModel(CounterDatFileMonth counterDatFileMonth) {
        if ( counterDatFileMonth == null ) {
            return null;
        }

        CounterDatFileMonthModel counterDatFileMonthModel = new CounterDatFileMonthModel();

        counterDatFileMonthModel.setCounterTotalMonth( counterDatFileMonth.getCounterTotalMonth() );
        counterDatFileMonthModel.setIdCounterFile( counterDatFileMonth.getIdCounterFile() );
        counterDatFileMonthModel.setMonthRiferimer( counterDatFileMonth.getMonthRiferimer() );
        counterDatFileMonthModel.setStringDescription( counterDatFileMonth.getStringDescription() );
        counterDatFileMonthModel.setYearRiferiment( counterDatFileMonth.getYearRiferiment() );

        return counterDatFileMonthModel;
    }

    protected List<CounterDatFileMonthModel> counterDatFileMonthListToCounterDatFileMonthModelList(List<CounterDatFileMonth> list) {
        if ( list == null ) {
            return null;
        }

        List<CounterDatFileMonthModel> list1 = new ArrayList<CounterDatFileMonthModel>( list.size() );
        for ( CounterDatFileMonth counterDatFileMonth : list ) {
            list1.add( counterDatFileMonthToCounterDatFileMonthModel( counterDatFileMonth ) );
        }

        return list1;
    }

    protected CounterDatFileMonth counterDatFileMonthModelToCounterDatFileMonth(CounterDatFileMonthModel counterDatFileMonthModel) {
        if ( counterDatFileMonthModel == null ) {
            return null;
        }

        CounterDatFileMonth counterDatFileMonth = new CounterDatFileMonth();

        counterDatFileMonth.setIdCounterFile( counterDatFileMonthModel.getIdCounterFile() );
        counterDatFileMonth.setStringDescription( counterDatFileMonthModel.getStringDescription() );
        counterDatFileMonth.setMonthRiferimer( counterDatFileMonthModel.getMonthRiferimer() );
        counterDatFileMonth.setYearRiferiment( counterDatFileMonthModel.getYearRiferiment() );
        counterDatFileMonth.setCounterTotalMonth( counterDatFileMonthModel.getCounterTotalMonth() );

        return counterDatFileMonth;
    }

    protected List<CounterDatFileMonth> counterDatFileMonthModelListToCounterDatFileMonthList(List<CounterDatFileMonthModel> list) {
        if ( list == null ) {
            return null;
        }

        List<CounterDatFileMonth> list1 = new ArrayList<CounterDatFileMonth>( list.size() );
        for ( CounterDatFileMonthModel counterDatFileMonthModel : list ) {
            list1.add( counterDatFileMonthModelToCounterDatFileMonth( counterDatFileMonthModel ) );
        }

        return list1;
    }

    protected SessionMonthCounterModel sessionMonthCounterToSessionMonthCounterModel(SessionMonthCounter sessionMonthCounter) {
        if ( sessionMonthCounter == null ) {
            return null;
        }

        SessionMonthCounterModel sessionMonthCounterModel = new SessionMonthCounterModel();

        sessionMonthCounterModel.setIdSession( sessionMonthCounter.getIdSession() );
        sessionMonthCounterModel.setMonthReference( sessionMonthCounter.getMonthReference() );
        sessionMonthCounterModel.setTotalNumber( sessionMonthCounter.getTotalNumber() );

        return sessionMonthCounterModel;
    }

    protected List<SessionMonthCounterModel> sessionMonthCounterListToSessionMonthCounterModelList(List<SessionMonthCounter> list) {
        if ( list == null ) {
            return null;
        }

        List<SessionMonthCounterModel> list1 = new ArrayList<SessionMonthCounterModel>( list.size() );
        for ( SessionMonthCounter sessionMonthCounter : list ) {
            list1.add( sessionMonthCounterToSessionMonthCounterModel( sessionMonthCounter ) );
        }

        return list1;
    }

    protected SessionMonthCounter sessionMonthCounterModelToSessionMonthCounter(SessionMonthCounterModel sessionMonthCounterModel) {
        if ( sessionMonthCounterModel == null ) {
            return null;
        }

        SessionMonthCounter sessionMonthCounter = new SessionMonthCounter();

        sessionMonthCounter.setIdSession( sessionMonthCounterModel.getIdSession() );
        sessionMonthCounter.setTotalNumber( sessionMonthCounterModel.getTotalNumber() );
        sessionMonthCounter.setMonthReference( sessionMonthCounterModel.getMonthReference() );

        return sessionMonthCounter;
    }

    protected List<SessionMonthCounter> sessionMonthCounterModelListToSessionMonthCounterList(List<SessionMonthCounterModel> list) {
        if ( list == null ) {
            return null;
        }

        List<SessionMonthCounter> list1 = new ArrayList<SessionMonthCounter>( list.size() );
        for ( SessionMonthCounterModel sessionMonthCounterModel : list ) {
            list1.add( sessionMonthCounterModelToSessionMonthCounter( sessionMonthCounterModel ) );
        }

        return list1;
    }

    protected SpecificDifferenceModel specificDifferenceToSpecificDifferenceModel(SpecificDifference specificDifference) {
        if ( specificDifference == null ) {
            return null;
        }

        SpecificDifferenceModel specificDifferenceModel = new SpecificDifferenceModel();

        specificDifferenceModel.setIdSpecifiDifference( specificDifference.getIdSpecifiDifference() );
        specificDifferenceModel.setReferencePrimary( specificDifference.getReferencePrimary() );
        specificDifferenceModel.setReferenceSecondary( specificDifference.getReferenceSecondary() );
        specificDifferenceModel.setTotalDifferenceNumber( specificDifference.getTotalDifferenceNumber() );
        specificDifferenceModel.setTotalDifferencePercentage( specificDifference.getTotalDifferencePercentage() );

        return specificDifferenceModel;
    }

    protected List<SpecificDifferenceModel> specificDifferenceListToSpecificDifferenceModelList(List<SpecificDifference> list) {
        if ( list == null ) {
            return null;
        }

        List<SpecificDifferenceModel> list1 = new ArrayList<SpecificDifferenceModel>( list.size() );
        for ( SpecificDifference specificDifference : list ) {
            list1.add( specificDifferenceToSpecificDifferenceModel( specificDifference ) );
        }

        return list1;
    }

    protected SpecificDifference specificDifferenceModelToSpecificDifference(SpecificDifferenceModel specificDifferenceModel) {
        if ( specificDifferenceModel == null ) {
            return null;
        }

        SpecificDifference specificDifference = new SpecificDifference();

        specificDifference.setIdSpecifiDifference( specificDifferenceModel.getIdSpecifiDifference() );
        specificDifference.setReferencePrimary( specificDifferenceModel.getReferencePrimary() );
        specificDifference.setReferenceSecondary( specificDifferenceModel.getReferenceSecondary() );
        specificDifference.setTotalDifferenceNumber( specificDifferenceModel.getTotalDifferenceNumber() );
        specificDifference.setTotalDifferencePercentage( specificDifferenceModel.getTotalDifferencePercentage() );

        return specificDifference;
    }

    protected List<SpecificDifference> specificDifferenceModelListToSpecificDifferenceList(List<SpecificDifferenceModel> list) {
        if ( list == null ) {
            return null;
        }

        List<SpecificDifference> list1 = new ArrayList<SpecificDifference>( list.size() );
        for ( SpecificDifferenceModel specificDifferenceModel : list ) {
            list1.add( specificDifferenceModelToSpecificDifference( specificDifferenceModel ) );
        }

        return list1;
    }
}
