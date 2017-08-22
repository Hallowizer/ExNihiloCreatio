package exnihilocreatio.registries.manager;

import exnihilocreatio.registries.registries.CompostRegistryNew;
import exnihilocreatio.registries.registries.CrookRegistryNew;
import exnihilocreatio.registries.registries.HammerRegistryNew;
import exnihilocreatio.registries.registries.SieveRegistryNew;

import java.util.ArrayList;
import java.util.List;

public final class ExNihiloRegistryManager {

    //region >>>> DEFAULT RECIPE PROVIDERS
    public static final List<ISieveDefaultRegistryProvider> SIEVE_DEFAULT_REGISTRY_PROVIDERS = new ArrayList<>();
    public static final List<IHammerDefaultRegistryProvider> HAMMER_DEFAULT_REGISTRY_PROVIDERS = new ArrayList<>();
    public static final List<ICompostDefaultRegistryProvider> COMPOST_DEFAULT_REGISTRY_PROVIDERS = new ArrayList<>();
    public static final List<ICrookDefaultRegistryProvider> CROOK_DEFAULT_REGISTRY_PROVIDERS = new ArrayList<>();
    public static final List<ICrucibleDefaultRegistryProvider> CRUCIBLE_DEFAULT_REGISTRY_PROVIDERS = new ArrayList<>();
    public static final List<IFluidBlockDefaultRegistryProvider> FLUID_BLOCK_DEFAULT_REGISTRY_PROVIDERS = new ArrayList<>();
    public static final List<IFluidOnTopDefaultRegistryProvider> FLUID_ON_TOP_DEFAULT_REGISTRY_PROVIDERS= new ArrayList<>();
    public static final List<IFluidTransformDefaultRegistryProvider> FLUID_TRANSFORM_DEFAULT_REGISTRY_PROVIDERS = new ArrayList<>();
    public static final List<IHeatDefaultRegistryProvider> HEAT_DEFAULT_REGISTRY_PROVIDERS = new ArrayList<>();
    public static final List<IOreDefaultRegistryProvider> ORE_DEFAULT_REGISTRY_PROVIDERS = new ArrayList<>();
    //endregion

    public static final CompostRegistryNew COMPOST_REGISTRY = new CompostRegistryNew();
    public static final CrookRegistryNew CROOK_REGISTRY = new CrookRegistryNew();
    public static final SieveRegistryNew SIEVE_REGISTRY = new SieveRegistryNew();
    public static final HammerRegistryNew HAMMER_REGISTRY = new HammerRegistryNew();


    //region >>>> DEFAULT RECIPE REGISTERS

    public static void registerSieveDefaultRecipeHandler(ISieveDefaultRegistryProvider provider) {
        SIEVE_DEFAULT_REGISTRY_PROVIDERS.add(provider);
    }

    public static void registerHammerDefaultRecipeHandler(IHammerDefaultRegistryProvider provider) {
        HAMMER_DEFAULT_REGISTRY_PROVIDERS.add(provider);
    }

    public static void registerCompostDefaultRecipeHandler(ICompostDefaultRegistryProvider provider) {
        COMPOST_DEFAULT_REGISTRY_PROVIDERS.add(provider);
    }

    public static void registerCrookDefaultRecipeHandler(ICrookDefaultRegistryProvider provider) {
        CROOK_DEFAULT_REGISTRY_PROVIDERS.add(provider);
    }

    public static void registerCrucibleDefaultRecipeHandler(ICrucibleDefaultRegistryProvider provider) {
        CRUCIBLE_DEFAULT_REGISTRY_PROVIDERS.add(provider);
    }

    public static void registerFluidBlockDefaultRecipeHandler(IFluidBlockDefaultRegistryProvider provider) {
        FLUID_BLOCK_DEFAULT_REGISTRY_PROVIDERS.add(provider);
    }

    public static void registerFluidTransformDefaultRecipeHandler(IFluidTransformDefaultRegistryProvider provider) {
        FLUID_TRANSFORM_DEFAULT_REGISTRY_PROVIDERS.add(provider);
    }

    public static void registerFluidOnTopDefaultRecipeHandler(IFluidOnTopDefaultRegistryProvider provider) {
        FLUID_ON_TOP_DEFAULT_REGISTRY_PROVIDERS.add(provider);
    }

    public static void registerHeatDefaultRecipeHandler(IHeatDefaultRegistryProvider provider) {
        HEAT_DEFAULT_REGISTRY_PROVIDERS.add(provider);
    }

    public static void registerOreDefaultRecipeHandler(IOreDefaultRegistryProvider provider) {
        ORE_DEFAULT_REGISTRY_PROVIDERS.add(provider);
    }
    //endregion
}
