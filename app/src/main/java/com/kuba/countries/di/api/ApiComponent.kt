package com.kuba.countries.di.api

import com.kuba.countries.model.CountriesService
import com.kuba.countries.view_model.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {
    fun inject(service: CountriesService)
    fun inject(viewModel: ListViewModel)
}
