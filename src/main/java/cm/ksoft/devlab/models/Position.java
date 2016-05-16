package cm.ksoft.devlab.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_position")
public class Position {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="lb_longitude")
    private Double lb_longitude;
	
	@Column(name="lb_latitude")
    private Double lb_latitude;

    public Position(){}
    
    public Position(double lo, double la){
    	//this.id=id;
    	this.lb_latitude=la;
    	this.lb_longitude=lo;
    }
    public Long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id=id;
    }

    public Double getLb_longitude(){
        return this.lb_longitude;
    }

    public void setLb_longitude(Double longitude){
        this.lb_longitude=longitude;
    }

    public double getLb_latitude(){ return this.lb_latitude;}

    public void setLb_latitude(Double latitude){
        this.lb_latitude=latitude;
    }

    @Override
    public String toString(){
        return String.format("Position. Latitude : %d, Longitude: %d", this.lb_latitude, this.lb_longitude);
    }
}
