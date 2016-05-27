(ns calculator.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [calculator.core-test]))

(enable-console-print!)

(doo-tests 'calculator.core-test)
