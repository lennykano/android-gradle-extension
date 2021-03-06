package com.kaneoriley.android.extension

import org.gradle.api.Project

class LibraryPlugin extends ExtensionPlugin {

    @Override
    void apply(Project project) {
        project.apply plugin: 'android-sdk-manager'
        project.apply plugin: 'com.android.library'
        project.apply plugin: 'com.github.dcendents.android-maven'
        super.apply(project)

        project.apt {
            arguments {
                androidManifestFile variant.outputs[0].processResources.manifestFile
            }
        }
    }
}
