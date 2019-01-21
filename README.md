"# EducationalMembers" 

Note (AutoWire)

	@Bean(autowire = Autowire.BY_TYPE)
	public GardenService richard() {
		return new GardeningServiceImpl();
	}
