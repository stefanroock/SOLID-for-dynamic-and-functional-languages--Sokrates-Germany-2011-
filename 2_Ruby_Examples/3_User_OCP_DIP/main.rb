require 'user'

stefan = User.new(1, "Stefan")
stefan.save
stefan_loaded = User::load(1)

