# Uncomment this line to define a global platform for your project
platform :ios, '8.0'

target 'RNXMPP' do
  pod 'XMPPFramework', :git => 'https://github.com/robbiehanson/XMPPFramework', :subspecs => [
      'All'
  ]
end

post_install do |installer|
  installer.pods_project.targets.each do |target|
    target.build_configurations.each do |config|
      config.build_settings['EXPANDED_CODE_SIGN_IDENTITY'] = ""
      config.build_settings['CODE_SIGNING_REQUIRED'] = "NO"
      config.build_settings['CODE_SIGNING_ALLOWED'] = "NO"
    end
  end
end
