(defn scale [shape horizontal-scale-factor vertical-scale-factor]
	(make-rectangle-with-new-lengths (* horizontal-scale-factor (:horizontal-length shape)) 
								                   (* vertical-shape-factor (:vertical-length shape))))

(def rectangle (make-rectangle 0 0 10 20))
(def square (make-square 0 0 10))
(def scaled-rectangle (scale rectangle 2 3))
(def scaled-square (scale square 2 3))
