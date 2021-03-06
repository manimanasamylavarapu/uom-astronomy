package tec.uom.astronomy.solarsystem.planet;

import javax.measure.Quantity;
import javax.measure.quantity.Time;

import tec.uom.astronomy.solarsystem.properties.general.GeneralAstronomicalProperties;
import tec.uom.se.util.SI;

public class Planet implements GeneralAstronomicalProperties {

	private String name;
	private Quantity<Time> age;
	private String discoveredBy;
	private PlanetaryPhysicalProperties planetaryPhysicalProperties;
	private PlanetaryOrbitalProperties planetaryOrbitalProperties;
	private PlanetaryAtmosphericProperties planetaryAtmosphericProperties;

	public Planet(String planetName, Quantity<Time> planetAge, String planetDiscoveredBy
			) {
		this.name = planetName;
		this.age = planetAge;
		this.discoveredBy = planetDiscoveredBy;
	}

	public PlanetaryPhysicalProperties getPlanetaryPhysicalProperties() {
		return planetaryPhysicalProperties;
	}

	public void setPlanetaryPhysicalProperties(
			PlanetaryPhysicalProperties planetaryPhysicalProperties) {
		this.planetaryPhysicalProperties = planetaryPhysicalProperties;
	}

	public PlanetaryOrbitalProperties getPlanetaryOrbitalProperties() {
		return planetaryOrbitalProperties;
	}

	public void setPlanetaryOrbitalProperties(
			PlanetaryOrbitalProperties planetaryOrbitalProperties) {
		this.planetaryOrbitalProperties = planetaryOrbitalProperties;
	}

	public PlanetaryAtmosphericProperties getPlanetaryAtmosphericProperties() {
		return planetaryAtmosphericProperties;
	}

	public void setPlanetaryAtmosphericProperties(
			PlanetaryAtmosphericProperties planetaryAtmosphericProperties) {
		this.planetaryAtmosphericProperties = planetaryAtmosphericProperties;
	}
	
	@Override
	public Quantity<Time> getAge() {
		Quantity<Time> timeInDays = age.to(SI.DAY);
		return timeInDays;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDiscoveredBy() {
		return discoveredBy;
	}
	
}
