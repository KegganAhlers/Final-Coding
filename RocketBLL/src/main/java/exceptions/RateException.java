package exceptions;

public class RateException extends Exception {
	rocketDomain.RateDomainModel RateDomainModel;
	public RateException(rocketDomain.RateDomainModel rateDomainModel) {
		super();
		RateDomainModel = rateDomainModel;
	}

	

	public rocketDomain.RateDomainModel getRateDomainModel() {
		return RateDomainModel;
	}

	//	TODO - RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)
}
