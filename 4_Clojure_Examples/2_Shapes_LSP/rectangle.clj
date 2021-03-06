(ns rectangle)

(defn make-rectangle [x, y, horizontal-length, vertical-length]
	{:x x, :y y, :horizontal-length horizontal-length, :vertical-length vertical-length})

(defn compute-area [rectangle]
	(* (:horizontal-length rectangle) (:vertical-length rectangle)))

(defn compute-perimeter [rectangle]
	(+ (* 2 (:horizontal-length rectangle) (* 2 (:vertical-length rectangle)))))

(defn make-rectangle-with-new-lengths [rectangle horizontal-length vertical-length]
	(make-rectangle (:x rectangle) (:y rectangle) horizontal-length vertical-length))

(defn draw-square [rectangle color]
	(println "This is a " color " rectangle at pos " (:x rectangle) "," (:y rectangle) 
				   " with horizontal side length " (:horizontal-length rectangle) " and vertical side length " (:vertical-length rectangle)))
