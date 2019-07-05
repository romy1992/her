package com.stat.bradip.resource.management;

import com.stat.bradip.commons.model.CustomerModel;
import com.stat.bradip.commons.model.DateFileModel;
import com.stat.bradip.commons.model.FaceFileModel;
import com.stat.bradip.commons.model.StringSubjectModel;
import com.stat.bradip.resource.entity.Customer;
import com.stat.bradip.resource.entity.DateFile;
import com.stat.bradip.resource.entity.FaceFile;
import com.stat.bradip.resource.entity.StringSubject;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-07-05T15:22:37+0200",
    comments = "version: 1.3.0.Beta2, compiler: Eclipse JDT (IDE) 3.16.0.v20181130-1748, environment: Java 1.8.0_211 (Oracle Corporation)"
)
@Component
public class MappingMapStructImpl extends MappingMapStruct {

    @Override
    public CustomerModel mappingEntityToModel(Customer model) {
        if ( model == null ) {
            return null;
        }

        CustomerModel customerModel = new CustomerModel();

        customerModel.setCodDateInsert( model.getCodDateInsert() );
        customerModel.setFaceList( faceFileListToFaceFileModelList( model.getFaceList() ) );
        customerModel.setId( model.getId() );
        customerModel.setName( model.getName() );

        return customerModel;
    }

    @Override
    public Customer mappingModelToEntity(CustomerModel entity) {
        if ( entity == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setCodDateInsert( entity.getCodDateInsert() );
        customer.setFaceList( faceFileModelListToFaceFileList( entity.getFaceList() ) );
        customer.setId( entity.getId() );
        customer.setName( entity.getName() );

        return customer;
    }

    protected StringSubjectModel stringSubjectToStringSubjectModel(StringSubject stringSubject) {
        if ( stringSubject == null ) {
            return null;
        }

        StringSubjectModel stringSubjectModel = new StringSubjectModel();

        stringSubjectModel.setIdString( stringSubject.getIdString() );
        stringSubjectModel.setNumber( stringSubject.getNumber() );
        stringSubjectModel.setStringDescription( stringSubject.getStringDescription() );

        return stringSubjectModel;
    }

    protected List<StringSubjectModel> stringSubjectListToStringSubjectModelList(List<StringSubject> list) {
        if ( list == null ) {
            return null;
        }

        List<StringSubjectModel> list1 = new ArrayList<StringSubjectModel>( list.size() );
        for ( StringSubject stringSubject : list ) {
            list1.add( stringSubjectToStringSubjectModel( stringSubject ) );
        }

        return list1;
    }

    protected DateFileModel dateFileToDateFileModel(DateFile dateFile) {
        if ( dateFile == null ) {
            return null;
        }

        DateFileModel dateFileModel = new DateFileModel();

        dateFileModel.setAnno( dateFile.getAnno() );
        dateFileModel.setData( dateFile.getData() );
        dateFileModel.setIdDatFile( dateFile.getIdDatFile() );
        dateFileModel.setMese( dateFile.getMese() );
        dateFileModel.setStringSubjectList( stringSubjectListToStringSubjectModelList( dateFile.getStringSubjectList() ) );

        return dateFileModel;
    }

    protected List<DateFileModel> dateFileListToDateFileModelList(List<DateFile> list) {
        if ( list == null ) {
            return null;
        }

        List<DateFileModel> list1 = new ArrayList<DateFileModel>( list.size() );
        for ( DateFile dateFile : list ) {
            list1.add( dateFileToDateFileModel( dateFile ) );
        }

        return list1;
    }

    protected FaceFileModel faceFileToFaceFileModel(FaceFile faceFile) {
        if ( faceFile == null ) {
            return null;
        }

        FaceFileModel faceFileModel = new FaceFileModel();

        faceFileModel.setAnno( faceFile.getAnno() );
        faceFileModel.setDatFileList( dateFileListToDateFileModelList( faceFile.getDatFileList() ) );
        faceFileModel.setDateInsert( faceFile.getDateInsert() );
        faceFileModel.setId( faceFile.getId() );
        faceFileModel.setIsOk( faceFile.getIsOk() );
        faceFileModel.setMese( faceFile.getMese() );
        faceFileModel.setNameFile( faceFile.getNameFile() );

        return faceFileModel;
    }

    protected List<FaceFileModel> faceFileListToFaceFileModelList(List<FaceFile> list) {
        if ( list == null ) {
            return null;
        }

        List<FaceFileModel> list1 = new ArrayList<FaceFileModel>( list.size() );
        for ( FaceFile faceFile : list ) {
            list1.add( faceFileToFaceFileModel( faceFile ) );
        }

        return list1;
    }

    protected StringSubject stringSubjectModelToStringSubject(StringSubjectModel stringSubjectModel) {
        if ( stringSubjectModel == null ) {
            return null;
        }

        StringSubject stringSubject = new StringSubject();

        stringSubject.setIdString( stringSubjectModel.getIdString() );
        stringSubject.setNumber( stringSubjectModel.getNumber() );
        stringSubject.setStringDescription( stringSubjectModel.getStringDescription() );

        return stringSubject;
    }

    protected List<StringSubject> stringSubjectModelListToStringSubjectList(List<StringSubjectModel> list) {
        if ( list == null ) {
            return null;
        }

        List<StringSubject> list1 = new ArrayList<StringSubject>( list.size() );
        for ( StringSubjectModel stringSubjectModel : list ) {
            list1.add( stringSubjectModelToStringSubject( stringSubjectModel ) );
        }

        return list1;
    }

    protected DateFile dateFileModelToDateFile(DateFileModel dateFileModel) {
        if ( dateFileModel == null ) {
            return null;
        }

        DateFile dateFile = new DateFile();

        dateFile.setAnno( dateFileModel.getAnno() );
        dateFile.setData( dateFileModel.getData() );
        dateFile.setIdDatFile( dateFileModel.getIdDatFile() );
        dateFile.setMese( dateFileModel.getMese() );
        dateFile.setStringSubjectList( stringSubjectModelListToStringSubjectList( dateFileModel.getStringSubjectList() ) );

        return dateFile;
    }

    protected List<DateFile> dateFileModelListToDateFileList(List<DateFileModel> list) {
        if ( list == null ) {
            return null;
        }

        List<DateFile> list1 = new ArrayList<DateFile>( list.size() );
        for ( DateFileModel dateFileModel : list ) {
            list1.add( dateFileModelToDateFile( dateFileModel ) );
        }

        return list1;
    }

    protected FaceFile faceFileModelToFaceFile(FaceFileModel faceFileModel) {
        if ( faceFileModel == null ) {
            return null;
        }

        FaceFile faceFile = new FaceFile();

        faceFile.setAnno( faceFileModel.getAnno() );
        faceFile.setDatFileList( dateFileModelListToDateFileList( faceFileModel.getDatFileList() ) );
        faceFile.setDateInsert( faceFileModel.getDateInsert() );
        faceFile.setId( faceFileModel.getId() );
        faceFile.setIsOk( faceFileModel.getIsOk() );
        faceFile.setMese( faceFileModel.getMese() );
        faceFile.setNameFile( faceFileModel.getNameFile() );

        return faceFile;
    }

    protected List<FaceFile> faceFileModelListToFaceFileList(List<FaceFileModel> list) {
        if ( list == null ) {
            return null;
        }

        List<FaceFile> list1 = new ArrayList<FaceFile>( list.size() );
        for ( FaceFileModel faceFileModel : list ) {
            list1.add( faceFileModelToFaceFile( faceFileModel ) );
        }

        return list1;
    }
}
