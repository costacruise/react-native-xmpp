Pod::Spec.new do |s|
  s.name         = "react-native-basic-xmpp"
  s.version      = "1.0.0"
  s.license      = "ISC"
  s.summary      = "XMPP Library for React Native"
  s.source_files  = "ios/RNXMPP/*.{h,m}"

  s.platform     = :ios, "8.0"

  s.authors      = { 'Pavlo Aksonov' => '' }
  s.homepage     = 'https://dev/null'
  s.source       = { git: 'https://github.com/aksonov/react-native-xmpp' }

  s.dependency 'React'
end
