
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.property
import javax.inject.Inject

open class MyRootExtension @Inject constructor(objects: ObjectFactory) {
    val hello: Property<String> = objects.property<String>().convention("what?!")
}