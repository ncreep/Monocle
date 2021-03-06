package monocle.function

import monocle.std._
import monocle.syntax._
import org.specs2.scalaz.Spec


class FieldsExample extends Spec {

  "_1 creates a Lens from a 2-6 tuple to its first element" in {
    (("Hello", 3) applyLens first get) ==== "Hello"

    (("Hello", 3, true) applyLens first set "World") ==== (("World", 3, true))

    (("Hello", 3, true, 5.6, 7L, 'c') applyLens first get) ==== "Hello"
  }

  "_2 creates a Lens from a 2-6 tuple to its second element" in {
    (("Hello", 3) applyLens second get) ==== 3

    (("Hello", 3, true, 5.6, 7L, 'c') applyLens second set 4) ==== (("Hello", 4, true, 5.6, 7L, 'c'))
  }

  // ...

  "_6 creates a Lens from a 6-tuple to its sixth element" in {
    (("Hello", 3, true, 5.6, 7L, 'c') applyLens sixth get) ==== 'c'

    (("Hello", 3, true, 5.6, 7L, 'c') applyLens sixth set 'a') ==== (("Hello", 3, true, 5.6, 7L, 'a'))
  }

}
