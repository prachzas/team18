package sut.se.g18.Entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Entity
@Table(
    name = "PROMOTION"
)
@NoArgsConstructor
public class PromotionEntity {
    @Id
    @SequenceGenerator(
        name = "promotion_seq",
        sequenceName = "promotion_seq"
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "promotion_seq"
    )
    @Column(
        name = "PROMOTION_ID",
        unique = true,
        nullable = false
    )
    @NonNull
    private Long promotionID;


    private String title;
    private @NonNull Date dateStart;
    private @NonNull Date dateEnd;
    private int discount;

    // open join table
    //Many To One with PromotionTypeEntity
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = PromotionTypeEntity.class)
    private PromotionTypeEntity promotionTypeEntity;
    
    //Many To One with MaidEntity
   // @ManyToOne(fetch = FetchType.EAGER, targetEntity = MaidEntity.class)

    //Many To One with CompanyEntity
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = CompanyEntity.class)
    private CompanyEntity companyEntity;




    public Long getPromotionID() {
        return this.promotionID;
    }

    public void setPromotionID(Long promotionID) {
        this.promotionID = promotionID;
    }



    public String getTitle() {
        return this.title;
    }

    public void setTitle(String detail) {
        this.title = detail;
    }

    public Date getDateStart() {
        return this.dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return this.dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public PromotionTypeEntity getPromotionTypeEntity() {
        return this.promotionTypeEntity;
    }

    public void setPromotionTypeEntity(PromotionTypeEntity promotionTypeEntity) {
        this.promotionTypeEntity = promotionTypeEntity;
    }

   // public MaidEntity getMaidEntity() {
     //   return this.maidEntity;
    //}

   // public void setMaidEntity(MaidEntity maidEntity) {
     //   this.maidEntity = maidEntity;
   // }

    public CompanyEntity getCompanyEntity() {
        return this.companyEntity;
    }

    public void setCompanyEntity(CompanyEntity companyEntity) {
        this.companyEntity = companyEntity;
    }
    


    
    
    




}
