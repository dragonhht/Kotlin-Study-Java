package hht.dragon.java.extend

/**
 * 继承.
 * @author: huang
 * Date: 18-1-11
 */
class ExtendClass : OpenClass() {

    override fun save() {
        super.save()
    }
}

class ExtendClassTwo(name: String) : Base(name) {

}