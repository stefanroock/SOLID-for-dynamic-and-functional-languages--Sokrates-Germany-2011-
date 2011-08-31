(ns shape)

(derive ::Rect ::Shape)
(derive ::Square ::Rect)
(defmulti area :Shape)
(defn rect [wd ht] {:Shape :Rect, :wd wd, :ht ht})
(defn square [wd] {:Shape :Square, :wd wd})
(defn circle [radius] {:Shape :Circle, :radius radius})

(defmethod area :Rect [r]
    (* (:wd r) (:ht r)))
(defmethod area :Circle [c]
    (* (. Math PI) (* (:radius c) (:radius c))))

(def r (rect 4 13))
(def s (square 6))
(def c (circle 12))

(println r)
(println s)
(println c)
(println (isa? ::Square ::Rect))
(println (area s))
