package com.furkanekiz.dependencyinjectiondemo

import dagger.Component

@Component(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {

    fun getSmartPhone(): SmartPhone
}