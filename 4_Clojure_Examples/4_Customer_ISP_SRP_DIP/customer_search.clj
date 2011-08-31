(ns customer_search)

(defn find-customer-by-name [customers name]
  (filter #(= name (:name %)) customers))
